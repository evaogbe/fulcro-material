(ns ogbe.fulcro.mui.icons.raw-on
  #?(:cljs (:require
            ["@mui/icons-material/RawOn" :default RawOn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-raw-on
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RawOn)))