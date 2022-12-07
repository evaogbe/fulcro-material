(ns ogbe.fulcro.mui.icons.battery3-bar
  #?(:cljs (:require
            ["@mui/icons-material/Battery3Bar" :default Battery3Bar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-battery3-bar
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Battery3Bar)))