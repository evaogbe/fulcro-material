(ns ogbe.fulcro.mui.icons.exposure-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ExposureRounded" :default ExposureRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-exposure-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ExposureRounded)))