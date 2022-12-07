(ns ogbe.fulcro.mui.icons.blinds-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BlindsSharp" :default BlindsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-blinds-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BlindsSharp)))