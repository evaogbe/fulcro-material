(ns ogbe.fulcro.mui.icons.badge-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BadgeSharp" :default BadgeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-badge-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BadgeSharp)))