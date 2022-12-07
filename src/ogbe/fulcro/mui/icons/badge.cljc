(ns ogbe.fulcro.mui.icons.badge
  #?(:cljs (:require
            ["@mui/icons-material/Badge" :default Badge]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-badge
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Badge)))