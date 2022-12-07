(ns ogbe.fulcro.mui.icons.push-pin
  #?(:cljs (:require
            ["@mui/icons-material/PushPin" :default PushPin]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-push-pin
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PushPin)))