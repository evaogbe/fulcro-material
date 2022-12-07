(ns ogbe.fulcro.mui.icons.diamond
  #?(:cljs (:require
            ["@mui/icons-material/Diamond" :default Diamond]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-diamond
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Diamond)))