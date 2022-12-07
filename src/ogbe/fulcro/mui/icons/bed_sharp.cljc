(ns ogbe.fulcro.mui.icons.bed-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BedSharp" :default BedSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bed-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BedSharp)))