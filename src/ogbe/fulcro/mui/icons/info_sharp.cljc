(ns ogbe.fulcro.mui.icons.info-sharp
  #?(:cljs (:require
            ["@mui/icons-material/InfoSharp" :default InfoSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-info-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InfoSharp)))