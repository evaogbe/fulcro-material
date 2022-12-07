(ns ogbe.fulcro.mui.icons.details-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DetailsRounded" :default DetailsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-details-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DetailsRounded)))