(ns ogbe.fulcro.mui.icons.hide-source
  #?(:cljs (:require
            ["@mui/icons-material/HideSource" :default HideSource]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hide-source
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HideSource)))