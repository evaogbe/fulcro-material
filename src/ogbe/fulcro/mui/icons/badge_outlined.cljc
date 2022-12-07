(ns ogbe.fulcro.mui.icons.badge-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BadgeOutlined" :default BadgeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-badge-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BadgeOutlined)))