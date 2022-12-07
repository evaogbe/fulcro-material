(ns ogbe.fulcro.mui.icons.sd-card-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SdCardSharp" :default SdCardSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sd-card-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SdCardSharp)))