(ns ogbe.fulcro.mui.icons.sd-card-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SdCardRounded" :default SdCardRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sd-card-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SdCardRounded)))