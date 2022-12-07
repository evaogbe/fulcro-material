(ns ogbe.fulcro.mui.icons.details-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DetailsSharp" :default DetailsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-details-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DetailsSharp)))