(ns ogbe.fulcro.mui.icons.cottage-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CottageSharp" :default CottageSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-cottage-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CottageSharp)))