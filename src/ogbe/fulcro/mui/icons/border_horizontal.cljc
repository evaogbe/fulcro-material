(ns ogbe.fulcro.mui.icons.border-horizontal
  #?(:cljs (:require
            ["@mui/icons-material/BorderHorizontal" :default BorderHorizontal]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-border-horizontal
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BorderHorizontal)))