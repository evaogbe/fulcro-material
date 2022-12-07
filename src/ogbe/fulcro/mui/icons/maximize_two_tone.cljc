(ns ogbe.fulcro.mui.icons.maximize-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/MaximizeTwoTone" :default MaximizeTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-maximize-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MaximizeTwoTone)))