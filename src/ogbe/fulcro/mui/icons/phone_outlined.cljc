(ns ogbe.fulcro.mui.icons.phone-outlined
  #?(:cljs (:require
            ["@mui/icons-material/PhoneOutlined" :default PhoneOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-phone-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PhoneOutlined)))