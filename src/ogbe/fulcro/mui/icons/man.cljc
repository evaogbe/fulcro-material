(ns ogbe.fulcro.mui.icons.man
  #?(:cljs (:require
            ["@mui/icons-material/Man" :default Man]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-man
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Man)))