(ns ogbe.fulcro.mui.icons.taxi-alert
  #?(:cljs (:require
            ["@mui/icons-material/TaxiAlert" :default TaxiAlert]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-taxi-alert
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TaxiAlert)))