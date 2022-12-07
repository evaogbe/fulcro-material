(ns ogbe.fulcro.mui.icons.skip-previous
  #?(:cljs (:require
            ["@mui/icons-material/SkipPrevious" :default SkipPrevious]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-skip-previous
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SkipPrevious)))