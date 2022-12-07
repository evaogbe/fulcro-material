(ns ogbe.fulcro.mui.icons.density-small
  #?(:cljs (:require
            ["@mui/icons-material/DensitySmall" :default DensitySmall]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-density-small
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DensitySmall)))