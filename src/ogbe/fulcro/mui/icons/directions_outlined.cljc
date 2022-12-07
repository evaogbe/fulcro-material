(ns ogbe.fulcro.mui.icons.directions-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DirectionsOutlined" :default DirectionsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-directions-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DirectionsOutlined)))