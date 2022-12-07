(ns ogbe.fulcro.mui.icons.other-houses
  #?(:cljs (:require
            ["@mui/icons-material/OtherHouses" :default OtherHouses]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-other-houses
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OtherHouses)))