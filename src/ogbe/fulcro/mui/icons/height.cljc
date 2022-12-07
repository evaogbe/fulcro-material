(ns ogbe.fulcro.mui.icons.height
  #?(:cljs (:require
            ["@mui/icons-material/Height" :default Height]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-height
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Height)))