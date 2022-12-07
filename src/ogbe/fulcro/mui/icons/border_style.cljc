(ns ogbe.fulcro.mui.icons.border-style
  #?(:cljs (:require
            ["@mui/icons-material/BorderStyle" :default BorderStyle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-style
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderStyle)))