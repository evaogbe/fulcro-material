(ns ogbe.fulcro.mui.icons.sd-card
  #?(:cljs (:require
            ["@mui/icons-material/SdCard" :default SdCard]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sd-card
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SdCard)))