(ns ogbe.fulcro.mui.icons.functions-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/FunctionsTwoTone" :default FunctionsTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-functions-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FunctionsTwoTone)))