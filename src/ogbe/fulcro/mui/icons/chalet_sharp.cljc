(ns ogbe.fulcro.mui.icons.chalet-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ChaletSharp" :default ChaletSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chalet-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChaletSharp)))