(ns ogbe.fulcro.mui.icons.casino-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CasinoSharp" :default CasinoSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-casino-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CasinoSharp)))