(ns ogbe.fulcro.mui.icons.pin-drop-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PinDropOutlined" :default PinDropOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pin-drop-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PinDropOutlined)))