(ns ogbe.fulcro.mui.icons.chrome-reader-mode
  #?(:cljs (:require
            ["@mui/icons-material/ChromeReaderMode" :default ChromeReaderMode]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-chrome-reader-mode
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ChromeReaderMode)))