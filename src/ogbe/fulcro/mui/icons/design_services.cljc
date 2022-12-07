(ns ogbe.fulcro.mui.icons.design-services
  #?(:cljs (:require
            ["@mui/icons-material/DesignServices" :default DesignServices]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-design-services
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DesignServices)))