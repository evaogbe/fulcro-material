(ns ogbe.fulcro.mui.icons.delivery-dining
  #?(:cljs (:require
            ["@mui/icons-material/DeliveryDining" :default DeliveryDining]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-delivery-dining
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeliveryDining)))