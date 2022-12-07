(ns ogbe.fulcro.mui.icons.my-location-outlined
  #?(:cljs (:require
            ["@mui/icons-material/MyLocationOutlined" :default MyLocationOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-my-location-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MyLocationOutlined)))