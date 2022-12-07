(ns ogbe.fulcro.mui.icons.sd-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/SdTwoTone" :default SdTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sd-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SdTwoTone)))