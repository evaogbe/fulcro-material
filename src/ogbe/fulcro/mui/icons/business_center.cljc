(ns ogbe.fulcro.mui.icons.business-center
  #?(:cljs (:require
            ["@mui/icons-material/BusinessCenter" :default BusinessCenter]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-business-center
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BusinessCenter)))