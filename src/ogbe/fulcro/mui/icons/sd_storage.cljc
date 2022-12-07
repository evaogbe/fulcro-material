(ns ogbe.fulcro.mui.icons.sd-storage
  #?(:cljs (:require
            ["@mui/icons-material/SdStorage" :default SdStorage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sd-storage
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SdStorage)))