(ns ogbe.fulcro.mui.icons.sd-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SdSharp" :default SdSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sd-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SdSharp)))