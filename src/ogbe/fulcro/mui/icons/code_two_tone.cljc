(ns ogbe.fulcro.mui.icons.code-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/CodeTwoTone" :default CodeTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-code-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CodeTwoTone)))