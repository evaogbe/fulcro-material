(ns ogbe.fulcro.mui.icons.tablet-outlined
  #?(:cljs (:require
            ["@mui/icons-material/TabletOutlined" :default TabletOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tablet-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TabletOutlined)))