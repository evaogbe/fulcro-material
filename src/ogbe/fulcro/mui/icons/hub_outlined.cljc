(ns ogbe.fulcro.mui.icons.hub-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HubOutlined" :default HubOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hub-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HubOutlined)))