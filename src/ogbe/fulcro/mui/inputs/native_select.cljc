(ns ogbe.fulcro.mui.inputs.native-select
  #?(:cljs (:require
            ["@mui/material/NativeSelect" :default NativeSelect]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-native-select #?(:clj  (fn [& _args])
                         :cljs (interop/react-input-factory NativeSelect)))
