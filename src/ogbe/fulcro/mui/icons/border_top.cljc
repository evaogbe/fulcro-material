(ns ogbe.fulcro.mui.icons.border-top
  #?(:cljs (:require
            ["@mui/icons-material/BorderTop" :default BorderTop]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-top
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderTop)))