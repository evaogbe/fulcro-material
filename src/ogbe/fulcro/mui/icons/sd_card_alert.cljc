(ns ogbe.fulcro.mui.icons.sd-card-alert
  #?(:cljs (:require
            ["@mui/icons-material/SdCardAlert" :default SdCardAlert]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sd-card-alert
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SdCardAlert)))