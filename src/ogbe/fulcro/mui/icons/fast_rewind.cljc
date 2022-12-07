(ns ogbe.fulcro.mui.icons.fast-rewind
  #?(:cljs (:require
            ["@mui/icons-material/FastRewind" :default FastRewind]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-fast-rewind
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory FastRewind)))