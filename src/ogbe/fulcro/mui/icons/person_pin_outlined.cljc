(ns ogbe.fulcro.mui.icons.person-pin-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PersonPinOutlined" :default PersonPinOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-person-pin-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PersonPinOutlined)))