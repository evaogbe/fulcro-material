(ns ogbe.fulcro.mui.icons.horizontal-rule
  #?(:cljs (:require
            ["@mui/icons-material/HorizontalRule" :default HorizontalRule]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-horizontal-rule
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HorizontalRule)))