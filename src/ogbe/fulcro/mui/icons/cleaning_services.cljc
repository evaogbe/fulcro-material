(ns ogbe.fulcro.mui.icons.cleaning-services
  #?(:cljs (:require
            ["@mui/icons-material/CleaningServices" :default CleaningServices]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cleaning-services
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CleaningServices)))