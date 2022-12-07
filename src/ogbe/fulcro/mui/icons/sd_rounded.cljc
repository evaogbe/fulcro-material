(ns ogbe.fulcro.mui.icons.sd-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SdRounded" :default SdRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sd-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SdRounded)))