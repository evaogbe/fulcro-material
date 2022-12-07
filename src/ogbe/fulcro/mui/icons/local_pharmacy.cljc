(ns ogbe.fulcro.mui.icons.local-pharmacy
  #?(:cljs (:require
            ["@mui/icons-material/LocalPharmacy" :default LocalPharmacy]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-pharmacy
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalPharmacy)))