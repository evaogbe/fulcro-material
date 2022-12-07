(ns ogbe.fulcro.mui.icons.construction
  #?(:cljs (:require
            ["@mui/icons-material/Construction" :default Construction]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-construction
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Construction)))