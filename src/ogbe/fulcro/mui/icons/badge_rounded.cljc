(ns ogbe.fulcro.mui.icons.badge-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BadgeRounded" :default BadgeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-badge-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BadgeRounded)))